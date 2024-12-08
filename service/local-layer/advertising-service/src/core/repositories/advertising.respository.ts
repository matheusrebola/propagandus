// src/products/products.repository.ts
import { Injectable } from '@nestjs/common';
import { Advertising } from '../entities/advertising.model';
import { CreateProductDto } from '../dtos/create-advertising.dto';

@Injectable()
export class ProductsRepository {
  constructor(
    @InjectRepository(Advertising)
    private readonly repository: Repository<Advertising>,
  ) {}

  async findAll(): Promise<Advertising[]> {
    return this.repository.find();
  }

  async create(createProductDto: CreateProductDto): Promise<Advertising> {
    const product = this.repository.create(createProductDto);
    return this.repository.save(product);
  }
}
