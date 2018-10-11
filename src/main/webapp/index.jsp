<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<H1>Заголовок страницы</H1>
<p>
    Абзац текста
<p>
<div>
    <a href="/hello">Hello link</a> <BR>
    <a href="/iterator">Iterator link</a><BR>
    <a href="/students">Get students</a> <BR>
    <a href="/cities">Get students city</a> <BR><BR>
    <form method="post" action="/hello">
        <input type="text" name = "testText">
        <input type="submit">
    </form>
</div>
<div>
    <BR>
    <form method="post" action="/insert_student">
        <fieldset>
            <legend>Вставка студента</legend>
            <label>Имя студента <input type="text" name = "name" required placeholder="Имя"></label>
            <label>Фамилия студента <input type="text" name = "family_name" required placeholder="Фамилия"></label>
            <label>Возраст <input type="text" name = "age" required placeholder="20"></label>
            <label>Контакты <input type="text" name = "contact" required placeholder="+79993332211"></label>
            <label>Id города <input type="text" name = "city" required placeholder="0"></label>
        </fieldset>
        <button type="submit">Отправить</button>
    </form>
</div>

</body>
</html>
