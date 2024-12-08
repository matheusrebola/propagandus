DELIMITER $$

CREATE TRIGGER location_after_insert
AFTER INSERT ON Location
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('Location', 'INSERT', NEW.id);
END$$

CREATE TRIGGER location_after_update
AFTER UPDATE ON Location
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('Location', 'UPDATE', NEW.id);
END$$

CREATE TRIGGER location_after_delete
AFTER DELETE ON Location
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('Location', 'DELETE', OLD.id);
END$$

DELIMITER ;