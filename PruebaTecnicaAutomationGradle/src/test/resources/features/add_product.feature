# Author: miguel.mejia@sophossolutions.com
# Feature: Añadir un producto al carrito
Feature: Product purchase process
	Scenario: User adds product to shopping cart
	Given User searchs a product
	When User picks up a product
	|producto|
	|Cama Divan 2 plazas|
	Then User adds product to shopping cart