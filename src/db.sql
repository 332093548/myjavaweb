
create table product
(
   id                  int not null auto_increment,
   name                varchar(20),
   price               decimal(8,2),
   remark              longtext,
   date                timestamp default CURRENT_TIMESTAMP,
   cid                 int,
   primary key (id)
);
/* ��Ʒ�������� */
insert into product (name,price,remark) values ('ʥ������',3000.00,'�����Ǽ򵥽���');
insert into product (name,price,remark) values ('��������',3000.00,'�����Ǽ򵥽���');
insert into product (name,price,remark) values ('Iphone6',6000.00,'�����Ǽ򵥽���');

select * from product;