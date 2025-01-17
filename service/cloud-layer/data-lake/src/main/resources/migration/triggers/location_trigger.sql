CREATE TRIGGER location_after_insert
AFTER INSERT ON location_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value, changed_at)
    VALUES ('location_table', 'INSERT', NEW.location_id, NOW());
END;