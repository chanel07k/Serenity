# author: Kristelle Young
  # language: es

  Característica: Inicio de Sesion
    Yo como parte del proceso de pruebas para blades necesito
    iniciar sesion en la pagina con mis creedenciales

    @Login
      Escenario: Iniciar sesion exitosamente
      Dado que el usuario navega por la pagina de inicio
      Cuando ingresa las creedenciales correctas
      Entonces deberia ver la pagina principal con la palabra Products
      Y cierro sesion

