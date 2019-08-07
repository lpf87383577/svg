### Vector 矢量图片

==1.AndroidStudio 生成Vector ==

右键-->new-->Vector Asset

==2.布局引用==
```python
    <ImageView
        android:src="@drawable/ic_cloud_queue_black_24dp"
        />
```

==3.文件格式==
```python
<vector>
    <group>
        <path>
        <path>
    </group>
</vector>
 
```
><vector>标签

name：矢量图的名字

width, height：矢量图的固有宽高，通常使用dp。

viewportWidth, viewportHeight：把矢量图的宽高分成多少个单元，这里的每个单元就对应pathData中的一个点坐标。

><group>标签

用来把多个<path>组合在一起，进行相同的处理。

><path>标签

name：路径的名称。

fillColor：图形的填充颜色。

pathData：定义控制点的位置，类似与Canvas当中的Path类。

==4.动态VectorDrawable==

animated-vector文件样式
```python
<animated-vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/vd_star">
    
    <!--name 对应vd_star中模块 animation 执行的动画-->
    <target
        android:name="star_group"
        android:animation="@animator/star_rotate" />

</animated-vector>

```

star_rotate 文件
```python
 <set xmlns:android="http://schemas.android.com/apk/res/android"

    android:ordering="sequentially">
    <!--缩放加旋转动画-->
    <!--ordering动画顺序  sequentiall依次，顺序执行  together 同时进行-->
    <objectAnimator
        android:duration="500"
        android:propertyName="rotation"
        android:valueFrom="0"
        android:valueTo="360" />
</set>

```
需要代码执行animator
```python
if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ((AnimatedVectorDrawable) imageView.getDrawable()).start();
        }
 
```
==注意点==

==Vector绘画时注意是填充fill还是描边stroke,两种执行动画时效果不一样==

```python

```

```python

```

```python

```

```python

```
        