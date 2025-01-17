CREATE TRIGGER date_time_after_insert
AFTER INSERT ON date_time_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value)
    VALUES ('date_time_table', 'INSERT', NEW.period_register_id);
END;