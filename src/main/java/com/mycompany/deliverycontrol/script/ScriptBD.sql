create database DeliveryControl;
drop database DeliveryControl;

use deliverycontrol;

-- criação tabela Cliente
create table Cliente(
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
    observacao varchar(30),
    horaEntrega varchar(4),
    statusPedido varchar(24),
	FOREIGN KEY (id_cliente) REFERENCES Cliente(id),
    FOREIGN KEY (id_entregador) REFERENCES Entregador(id)
);


-- cria tabela EntregaRealizada
create table EntregaRealizada(
	id integer not null primary key auto_increment,
	id_entregador int,
    id_pedido int,
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

select * from entregador where id = 17;

select * from cliente;

SELECT id, nome, telefone FROM entregador