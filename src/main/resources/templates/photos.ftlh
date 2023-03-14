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
<h4>Фото</h4>
<#list photos as photo>
    <div>
        <p><b>${photo.title}</b>${photo.price} руб. | <a href="/photos/${photo.id}">Подробнее</a></p>
    </div>
</#list>
<hr>
<h3>создать новую подборку</h3>
<form action="/photos/create" method="post">
    Название подборки: <input type="text" name="title"/><br><br>
    Описание подборки: <input type="text" name="description"/><br><br>
    Цена подборки: <input type="number" name="price"/><br><br>
    Город подборки: <input type="text" name="city"/><br><br>
    Автор подборки: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить"/>
</form>
</body>
</html>