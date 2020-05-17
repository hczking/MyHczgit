<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    photo by wangdachui<br>
    ${name}
    <form method="POST" enctype="multipart/form-data" action="/uploadFile">

        <input type="file" name="file" />

        <input type="submit" value="上传" />

    </form>

    <form method="POST"  action="/downLoadFile">

        <input type="submit" value="下载" />

    </form>
    <!--<form method="POST" action="/downloadfile">

        <p>输入文件名<input type="text" name="fname" /></p>

        <input type="submit" value="下载" />

    </form>-->
</div>
</body>
</html>