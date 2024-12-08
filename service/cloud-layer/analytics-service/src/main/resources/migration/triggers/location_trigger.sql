DELIMITER $$

CREATE TRIGGER location_after_insert
AFTER INSERT ON location_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('location_table', 'INSERT', OLD.id);
END$$

CREATE TRIGGER location_after_update
AFTER UPDATE ON location_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('location_table', 'UPDATE', OLD.id);
END$$

CREATE TRIGGER location_after_delete
AFTER DELETE ON location_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action, primary_key_value)
    VALUES ('location_table', 'DELETE', OLD.id);
END$$

DELIMITER ;
