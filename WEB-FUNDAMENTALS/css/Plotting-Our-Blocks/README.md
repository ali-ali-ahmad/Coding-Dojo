<h1>Plotting Our Blocks</h1>

<p>
Try to duplicate the image below by adjusting the CSS code provided. Use <strong>margins</strong> and <strong>paddings</strong> to adjust the spaces between divisions and use the <strong>display</strong> property to be able to put each block in its proper place. We may need additional CSS properties.
</p>

<hr>

![alt text](https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/css/Plotting-Our-Blocks/screenshots/pic1.jpg?raw=true)

<p>Here's the HTML code:</p>

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Position Practice</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <div class="top-nav"></div>
        <div class="side-nav"></div>
        <div class="main">
            <div class="sub-content"></div>
            <div class="sub-content"></div>
            <div class="sub-content"></div>
            <div id="advertisement"></div>
        </div>
    </div>
</body>
</html>
```

<p>And CSS:</p>

```html
.container{
    width: 950px;
    background-color: silver;
    margin: 0px auto;
}
.top-nav {
    height: 150px;
    background-color: green;
}
.side-nav {
    height: 300px;
    width: 200px;
    background-color: blue;
}
.main {
    height: 400px;
    width: 700px;
    background-color: red;
}
.sub-content {
    height: 200px;
    width: 210px;
    background-color: yellow;
}
#advertisement {
    height: 120px;
    width: 660px;
    background-color: purple;
}
```

<p>
While we do this assignment, we can make use <code>height</code> as well as the <code>vertical-align</code> property to give the necessary height to the division and also to vertically align some of the inline-blocks.
</p>


