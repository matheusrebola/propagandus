CREATE TRIGGER advertising_after_insert
AFTER INSERT ON advertising_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('advertising_table', 'INSERT', NEW.advertising_id, NOW());
END;

