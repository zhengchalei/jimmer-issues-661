create table if not exists author
(
    id        int primary key auto_increment,
    name      varchar(255) not null,
    tenant_id int          not null
);

create table if not exists book
(
    id        int primary key auto_increment,
    name      varchar(255) not null,
    author_id int          not null,
    tenant_id int          not null,
    foreign key (author_id) references author (id)
);
