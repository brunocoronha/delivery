-- Script Mysql versão 8.0 + 

create database if not exists DeliveryControl;

use deliverycontrol;

-- criação tabela Cliente
create table if not exists Cliente(
	id integer not null primary key auto_increment,
	nome varchar(30),
    endereco varchar(80),
    telefone varchar(13)
);

-- criação tabela entregador
create table Entregador(
	id integer not null primary key auto_increment,
    nome varchar(30),
	telefone varchar(13)
);

-- Criação table Pedido
create table Pedido(
	id integer not null primary key auto_increment,
	id_cliente integer,
    id_entregador integer,
    observacao varchar(400),
    statusPedido varchar(24),
	FOREIGN KEY (id_cliente) REFERENCES Cliente(id),
    FOREIGN KEY (id_entregador) REFERENCES Entregador(id)
);


-- cria tabela EntregaRealizada
create table EntregaRealizada(
	id integer not null primary key auto_increment,
	id_entregador int,
    id_pedido int,
    horaEntrega varchar(4),
    FOREIGN KEY (id_entregador) REFERENCES Entregador(id),
	FOREIGN KEY (id_pedido) REFERENCES Pedido(id)
);

create table EntregaCancelada(
	id integer not null primary key auto_increment,
    id_entregador int,
    id_pedido int,
    FOREIGN KEY (id_entregador) REFERENCES Entregador(id),
	FOREIGN KEY (id_pedido) REFERENCES Pedido(id)
);

create table login(
   id integer not null primary key auto_increment,
   nome_usuario varchar(40),
   senha_usuario varchar(40)
);

select * from entregador where id = 17;

select * from cliente;

SELECT id, nome, telefone FROM entregador