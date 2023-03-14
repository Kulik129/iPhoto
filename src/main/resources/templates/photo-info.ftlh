<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>iPhoto</title>
</head>
<body>
<h1>iPhoto</h1><hr>
<h4>Подробная иноформация</h4>

<hr>
<h3>создать новую подборку</h3>
<b>Название: </b> ${photos.title}<br>
<b>Описание: </b> ${photos.description}<br>
<b>Цена: </b> ${photos.price}<br>
<b>Город: </b> ${photos.city}<br>
<b>Автор: </b> ${photos.author}<br>



<form action="/photos/delete/${photos.id}" method="post">
    <input type="submit" value="удалить"/>
</form>
</body>
</html>