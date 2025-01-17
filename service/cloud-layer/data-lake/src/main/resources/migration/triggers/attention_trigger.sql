CREATE TRIGGER attention_after_insert
AFTER INSERT ON attention_table
FOR EACH ROW
BEGIN
    INSERT INTO change_log (table_name, action_type, primary_key_value, changed_at)
    VALUES ('attention_table', 'INSERT', NEW.attention_id, NOW());
END;