# Author: miguel.mejia@sophossolutions.com
# Feature: Añadir un producto al carrito
Feature: Product purchase process
	Scenario: User adds product to shopping cart
	Given User searchs a product
	|product|
	|Cama Divan 2 plazas|
	When User picks up a product
	Then User adds product to shopping cart