CREATE TABLE contract
(
    id            INT PRIMARY KEY,
    system        VARCHAR(100) NOT NULL,
    order_number  VARCHAR(100) NOT NULL,
    from_date     VARCHAR(100) NOT NULL,
    to_date       VARCHAR(100) NOT NULL,
    amount        BIGINT       NOT NULL,
    amount_type   VARCHAR(100) NOT NULL,
    amount_period VARCHAR(100) NOT NULL,
    active        BOOLEAN      NOT NULL
);