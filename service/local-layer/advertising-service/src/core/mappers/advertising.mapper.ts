// src/products/mappers/product.mapper.ts
import { CreateProductDto } from '../dtos/create-advertising.dto';
import { Product } from '../entities/advertising.model';

export class ProductMapper {
  static toModel(createProductDto: CreateProductDto): Product {
    const product = new Product();
    product.name = createProductDto.name;
    product.description = createProductDto.description;
    product.price = createProductDto.price;
    return product;
  }

  static toDto(product: Product): CreateProductDto {
    return {
      name: product.name,
      description: product.description,
      price: product.price,
    };
  }
}
