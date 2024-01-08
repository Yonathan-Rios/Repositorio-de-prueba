<!DOCTYPE html>
<html lang="es">
<head>
  <title>Página de Yoni</title>
</head>
<body>

  <h1>¡Bienvenido a la página de Yoni!</h1>

  <form action="index.php" method="post">
    <input type="text" name="nombre" placeholder="Tu nombre">
    <input type="radio" name="conoce_a_yoni" value="si"> Sí
    <input type="radio" name="conoce_a_yoni" value="no"> No
    <input type="submit" value="Siguiente">
  </form>

  <?php

    if ($_POST["conoce_a_yoni"] == "si") {
      echo "<h2>Opción 1</h2>";
      echo "<p>Vale por una salida a comer y Recorcholis o Happyland</p>";
      echo "<a href='index.php?opcion=2'>Quieres saber que tenía la opción 2?</a>";
    } else {
      echo "<h2>Opción 2</h2>";
      echo "<p>Vale para ir a desayunar a un lugar bonito y cine (esto puede cambiar)</p>";
    }

  ?>

</body>
</html>
