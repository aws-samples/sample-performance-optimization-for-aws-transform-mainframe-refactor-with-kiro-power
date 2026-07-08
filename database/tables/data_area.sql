-- Table: public.data_area
CREATE TABLE IF NOT EXISTS data_area
(
    IDENTIFIER BIGSERIAL PRIMARY KEY,
    name text NOT NULL,
    lock boolean,
    length integer NOT NULL,
    version integer,
    value bytea,
    type text,
     -- EXTRA COLUMNS
    _LASTUPDATE_TIMESTAMP TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    _CREATION_DATE TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);