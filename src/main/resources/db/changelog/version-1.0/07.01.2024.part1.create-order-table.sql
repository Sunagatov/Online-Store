CREATE TABLE IF NOT EXISTS orders
(
    id                          UUID        PRIMARY KEY,
    user_id                     UUID        NOT NULL,
    created_at                  TIMESTAMPTZ DEFAULT current_timestamp,
    status                      VARCHAR(55) NOT NULL,
    items_quantity              INT         NOT NULL CHECK (items_quantity >= 0),
    address_id                  UUID        NOT NULL,
    items_total_price           DECIMAL     NOT NULL CHECK (items_total_price > 0),

    CONSTRAINT fk_address
        FOREIGN KEY (address_id)
            REFERENCES address (id)
            ON DELETE CASCADE
)