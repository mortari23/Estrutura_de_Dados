create database lanchonete_07_04
go

use lanchonete_07_04

create table categorias
(
codigo	int			not null	primary key identity,
nome	varchar(50) not null
)
go

create table lanches 
(
codigo				int				not null	primary key identity,
nome				varchar(50)		not null,
preco				decimal (10,2)	not null,
calorias			int				not null, 
categoria_codigo	int				not null	references categorias,
)
go

create table bebidas
(
codigo		int				 not null primary key identity,
nome		varchar(50)		 not null,
preco		decimal(10,2)	 not null,
estoque		int
)
go

Create table ufs
(
sigal		char(2)		not null primary key,
nome		varchar(50) not null
)
go

create table cidades
(
codigo		int			not null primary key identity,
nome		varchar(50) not null,
uf_sigla	char(2)		not null references ufs
)
go

create table ceps
(
nr				varchar(10) not null primary key,
cidade_codigo	int			not null references cidades
)
go

create table pessoas
(
codigo		int				not null primary key identity,
nome		varchar(50)		not null,
cpf			varchar(15)		not null unique,
cep_nr		varchar(10)		not null references ceps,
logradouro	varchar(100)	not null,
nr			varchar(5)		not null
)
go

create table telefones
(
pessoas_codigo	int			not null references pessoas,
nr				varchar(20) not null,
primary key(pessoas_codigo, nr)
)
go

create table clientes
(
pessoa_codigo	int		not null	primary key references pessoas,
estrelas		int 
)
go

create table funcionarios 
(
pessoa_codigo	int				not null primary key references pessoas,
salario			decimal(10,2)	not null
)
go

create table entregadores
(
pessoa_codigo	int				not null primary key references pessoas,
valor_diaria	decimal(10,2)	not null
)
go

create table entregas
(
codigo				int			not null primary key identity,
data_hora_saida		datetime	null,
status int						null,
entregadir_codigo	int			not null references entregadores 
)
go

create table pedidos 
(
 nr						int				not null	primary key identity,
 data					datetime		not null	default getdate(),
 total					decimal(10,2)	null,
 status					int				null,
 cliente_codigo			int				not null	references clientes,
 funcionario_codigo		int				not null	references funcionarios,
 entrega_codigo			int				null		references entregas
)
go

create table pedidos_lanches
(
pedido_nr		int				not null references pedidos,
lanches_codigo	int				not null references lanches,
qtd				int				not null,
preco			decimal(10,2)	not null,
primary key (pedido_nr, lanches_codigo)
)
go

create table pedidos_bebidas
(
pedido_nr			int				not null	references pedidos,
bebida_codigo		int				not null	references bebidas,
qtd					int				not null,
preco				decimal (10,2)	not null,
primary key (pedido_nr, bebida_codigo)
)
go


-------------------------------

select * from categorias

insert into categorias values ('Hamburguer'), ('Frango'), ('Filé')
select * from categorias

select * from lanches
insert into lanches values ('X-tudo', 30, 1000, 1)
insert into lanches values ('X-Bacon', 25, 700, 1)
insert into lanches values ('Peito Tudo', 27, 650, 2)
insert into lanches values ('X-tudo', 30, 1000, 1)

insert into bebidas values ('Coca-cola Zero Lata 350 Ml', 6, 500)
insert into bebidas values ('Cotubinha', 10, 50)
insert into bebidas values ('Long Neck Stella Ultra', 15, 50)
select * from  bebidas

insert into ufs values ('SP', 'São Paulo'), ('MG', 'Minas Gerais')
Select * from ufs

insert into cidades values ('São José do Rio Preto', 'SP')
insert into cidades values ('Fronteira',  'MG')
insert into cidades values ('Mirassol', 'SP')
select * from cidades

select * from ceps
insert into ceps values ('15043-020', 1)
insert into ceps values ('15130-000', 3)
insert into ceps values ('38230-000', 2)

select * from pessoas
insert into pessoas values ('Matheus Mortari', '1010', '15043-020', 'Rua Fernandópolis', '2510')
insert into pessoas values ('Matheus de Pau', '2020', '15130-000', 'Rua Maria de Fatima', '1000')
insert into pessoas values ('Pedro Linhares', '3030', '38230-000', 'Av. Minas Gerais', '150')

select * from clientes
insert into clientes values (1,1)
select * from funcionarios 
insert into funcionarios values (2,2000)
select * from entregadores
insert into entregadores values (3,150)

select * from entregas
insert into entregas (entregadir_codigo) values (3)

select * from pedidos
insert into pedidos (cliente_codigo, funcionario_codigo) values (1,2)

insert into pedidos_lanches values (1,1,3,30)
insert into pedidos_lanches values (1,3,5,27)
insert into pedidos_lanches values (1,2,2,25)

select * from pedidos_lanches

select * from bebidas
insert into pedidos_bebidas values (1,2,3,10)
insert into pedidos_bebidas values (1,1,1,6)

SELECT SUM(Total) Total FROM

(
SELECT SUM  (qtd *preco) as total 
FROM pedidos_lanches
where pedido_nr = 1
UNION
SELECT SUM  (qtd *preco) as total 
FROM pedidos_bebidas
where pedido_nr = 1
) T 

update pedidos set total = 311, status = 1 
where nr = 1

update pedidos set entrega_codigo = 1 
where nr = 1

select * from pedidos


SELECT * FROM entregas
update entregas set data_hora_saida = GETDATE() where  codigo =  1

select * from entregas