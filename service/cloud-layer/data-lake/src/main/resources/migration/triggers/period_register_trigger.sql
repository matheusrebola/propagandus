CREATE TRIGGER date_time_after_insert
AFTER INSERT ON date_time_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value)
    VALUES ('date_time_table', 'INSERT', NEW.period_register_id);
END;

CREATE TRIGGER date_time_after_update
AFTER UPDATE ON date_time_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value)
    VALUES ('date_time_table', 'UPDATE', NEW.period_register_id);
END;

CREATE TRIGGER date_time_after_delete
AFTER DELETE ON date_time_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value)
    VALUES ('date_time_table', 'DELETE', OLD.period_register_id);
END;