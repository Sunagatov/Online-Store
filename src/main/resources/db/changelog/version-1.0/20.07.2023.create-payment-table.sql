CREATE TABLE IF NOT EXISTS public.payment
(
    id          UUID            PRIMARY KEY,
    order_id    UUID            NOT NULL,
    session_id  TEXT            NOT NULL,
    status      VARCHAR(32),
    description TEXT,

    CONSTRAINT fk_order
        FOREIGN KEY (order_id)
            REFERENCES orders (id)
            ON DELETE CASCADE
);