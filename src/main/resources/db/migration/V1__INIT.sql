create table paciente
(
    id_paciente      int primary key auto_increment,
    run              varchar(10) unique,
    nombres          varchar(100) not null,
    apellidos        varchar(100) not null,
    fecha_nacimiento date         not null,
    correo           varchar(100)
);
create table atencion
(
    id             int primary key auto_increment,
    fecha_atencion date not null,
    hora_atencion  date not null,
    costo          int  not null,
    id_paciente    int  not null,

    constraint fk_atencion foreign key (id_paciente) references paciente (id_paciente)
);