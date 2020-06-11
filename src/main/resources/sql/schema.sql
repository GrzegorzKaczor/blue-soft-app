BEGIN;
CREATE TABLE system
(
    id                 bigint                  NOT NULL GENERATED ALWAYS AS IDENTITY,
    name               character varying(30)   NOT NULL,
    description_system character varying(1020) NOT NULL,
    technologies       character varying(510)  NOT NULL,
    owner              character varying(30),
    PRIMARY KEY (id)
);

CREATE TABLE contract
(
    id            bigint                NOT NULL GENERATED ALWAYS AS IDENTITY,
    order_number  character varying(15) NOT NULL,
    from_date     date                  NOT NULL,
    to_date       date                  NOT NULL,
    amount        bigint                NOT NULL,
    amount_type   integer               NOT NULL,
    active        boolean               NOT NULL,
    amount_period integer               NOT NULL,
    system_id     integer,
    PRIMARY KEY (id),
    FOREIGN KEY (system_id) REFERENCES system (id)
);

INSERT INTO system (name, description_system, technologies, owner)
values ('KUCYK', 'Kucyk system', 'Java 8, PostgreSQL, Spring, Apache Tiles, jQuery, DataTable Plugin', 'Budimex');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('22/2011', '2012-02-02', '2014-04-03', 10000, 0, 0, true, 1);

INSERT INTO system (name, description_system, technologies, owner)
values ('ŁÓDKA', 'ŁÓDKA system', 'Java 11, MySQL, Spring, Angular', 'DUFRY');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('21/2012', '2012-03-10', '2014-03-03', 555, 0, 0, true, 2);

INSERT INTO system (name, description_system, technologies, owner)
values ('KAPISZON', 'KAPISZON system', 'Java 7, Oracle, JavaEE', 'ERSTE');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('34/2010', '2011-06-04', '2014-06-05', 45333, 0, 0, true, 3);

INSERT INTO system (name, description_system, technologies, owner)
values ('KOTEK', 'KOTEK system', 'Java 11, PostgreSQL, React', 'DHL');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('22/2015', '2015-01-21', '2016-01-01', 12331, 1, 1, false, 4);

INSERT INTO system (name, description_system, technologies, owner)
values ('DEMON', 'DEMON system', 'Java 11, PostgreSQL, Angular', 'Bank PKO');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('303/2017', '2017-02-22', '2016-01-01', 12211, 0, 0, true, 5);

INSERT INTO system (name, description_system, technologies, owner)
values ('ZÓŁWIK', 'ZÓŁWIK system', 'Java 7, MySql, JavaEE', 'LOT');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('212/2017', '1917-01-23', '2017-12-25', 12212, 0, 0, true, 6);

INSERT INTO system (name, description_system, technologies, owner)
values ('KOJOTEK', 'KOJOTEK system', 'Java 8, Oracle, VueJS', 'NEUCA');
INSERT INTO contract (order_number, from_date, to_date, amount, amount_type, amount_period, active, system_id)
values ('311/2017', '2017-01-12', '2017-12-31', 44400, 0, 0, true, 7);

COMMIT;





