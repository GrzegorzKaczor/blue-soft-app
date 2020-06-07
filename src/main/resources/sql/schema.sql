CREATE TABLE contract
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    active boolean,
    amount bigint,
    amount_period integer,
    amount_type integer,
    from_date date,
    order_number character varying(255),
    system character varying(255),
    to_date date,
    CONSTRAINT contract_pkey PRIMARY KEY (id)
);

INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('KUCYK', '22/2011', '2012-02-02', '2014-04-03', 10000, 0, 0, true);
INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('ŁÓDKA', '21/2012', '2012-03-10', '2014-03-03', 555, 0, 0, true);
INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('KAPISZON', '34/2010', '2011-06-04', '2014-06-05', 45333, 0, 0, true);
INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('KOTEK', '22/2015', '2015-01-21', '2016-01-01', 12331, 1, 1, false);
INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('DEMON', '303/2017', '2017-02-22', '2016-01-01', 12211, 0, 0, true);
INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('ZÓŁWIK', '212/2017', '1917-01-23', '2017-12-25', 12212, 0, 0, true);
INSERT INTO contract (system, order_number, from_date, to_date, amount, amount_type, amount_period, active)
values ('KOJOTEK', '311/2017', '2017-01-12', '2017-12-31', 44400, 0, 0, true);