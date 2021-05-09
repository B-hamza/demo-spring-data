CREATE TABLE IF NOT EXISTS demo (
    id uuid NOT NULL,
    entities UUID ARRAY,
    CONSTRAINT pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS demo_string (
    id uuid NOT NULL,
    entities VARCHAR ARRAY,
    CONSTRAINT string_pkey PRIMARY KEY (id)
);