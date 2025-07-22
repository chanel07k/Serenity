# author: Kristelle Young
  # language: es

Característica: Comprar Producto
  Yo como parte del proceso de pruebas para blades necesito
  comprar productos y removerlos del carrito

  @Comprar
  Escenario: Comprar productos y remover
    Dado que el usuario navega por la pagina y seleciona el producto
    Cuando hace click y valida la selecion en el carrito Your Cart
    Y validar la compra de Sauce Labs Backpack y Sauce Labs Bike Light
    Entonces deberia poder remover Sauce Labs Bike Light y validar