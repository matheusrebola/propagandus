import { DataSource } from 'typeorm';
import { Advertising } from '../core/entities/advertising.model';
import 'reflect-metadata';

export const mysqlDataSource = new DataSource({
  type: 'mysql',
  host: 'localhost',
  port: 3306,
  username: 'root',
  password: 'password',
  database: 'testdb',
  synchronize: true,
  entities: [Advertising], // Adicione todas as entidades que você usará
});
