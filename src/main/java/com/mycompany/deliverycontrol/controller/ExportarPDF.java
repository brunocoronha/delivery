package com.mycompany.deliverycontrol.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.Desktop;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ExportarPDF {

    public static void exportToPDF(JTable table) throws Exception {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar arquivo PDF");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos PDF (*.pdf)", "pdf");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";

            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                PdfPTable pdfTable = createPdfTable(table);
                document.add(pdfTable);

                System.out.println("Dados exportados com sucesso para o arquivo: " + filePath);
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(new File(filePath));
                }
            } catch (DocumentException | IOException e) {
                throw new Exception("Erro ao exportar PDF");
            } finally {
                document.close();
            }
        }
    }

    private static PdfPTable createPdfTable(JTable table) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        PdfPTable pdfTable = new PdfPTable(columnCount);
        pdfTable.setWidthPercentage(100);

        JTableHeader tableHeader = table.getTableHeader();
        for (int column = 0; column < columnCount; column++) {
            PdfPCell cell = new PdfPCell(new Phrase(tableHeader.getColumnModel().getColumn(column).getHeaderValue().toString()));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            pdfTable.addCell(cell);
        }

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Object value = model.getValueAt(row, column);
                pdfTable.addCell(value != null ? value.toString() : "");
            }
        }

        return pdfTable;
    }
    
}
