
<html>
<h1 style="text-align: center;">
<body bgcolor="#E6E6FA" >
<strong><h2><font color="red">Android DrumPad </font></strong></h1>
<h1 style="text-align: left;">
Contents</h1>
<ul>
<li>Creating an Android Studio Project</li>
<li>Design Your APP</li>
<li>Adding Row folder in your project</li>
<li>Implementing Java Part</li>
</ul>
<h2>
Creating an Android Studio Project</h2>
<ul>
<li>Open Android Studio and Create a New Project. I created&nbsp;<strong> DrumPad.</strong></li>
</ul>
<h2>
Design Your App</h2>
<h3>
Activity_main.xml</h3>
<script src="https://snipsave.com/embed/JYM6kWgeRJnBbUUjrD.js"></script>

<p style="text-align: center;">The above all&nbsp; code will generate the following UI</p><br />
<br />
<div class="separator" style="clear: both; text-align: center;">
<a href="https://trello-attachments.s3.amazonaws.com/5b963d814c4c608687f47dfe/5bb232afa1232220ed4ec0a9/040c702aa3b1104f7a97d1051514b74b/Screenshot_2018-10-02-18-39-01-469_com.lco.my_drum.png" imageanchor="1" style="margin-left: 1em; margin-right: 1em;"><img border="0" data-original-height="450" data-original-width="800" height="225" src="https://trello-attachments.s3.amazonaws.com/5b963d814c4c608687f47dfe/5bb232afa1232220ed4ec0a9/040c702aa3b1104f7a97d1051514b74b/Screenshot_2018-10-02-18-39-01-469_com.lco.my_drum.png" width="400" /></a></div>
<br />
<br />
<table>
<tbody>
<tr>
<td width="198"></td>
<td width="185"></td>
</tr>
</tbody>
</table>
<br />
<br />
<h2>
Adding Row folder in your project</h2>
<ul>
<li>Right Click on Java folder�new �Folder�Raw Resource Folder</li>
<li>Add All media/sounds file in ths folder</li>
</ul>
<h2>
Implementing Java Part</h2>
<br />
<ul>
<li>First We create Object of all media file and add music from row folder</li>
</ul>
<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; //create object of&nbsp; media player<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; m1 = MediaPlayer.create(MainActivity.this, R.raw.one);<br />
<ul>
<li>Now play sound when user click on button</li>
</ul>
Adding OnClickListener on each button and play sounds .<br />
<strong>m1.start(); </strong><br />
<h3>
MainActivity.java</h3>
<script src="https://snipsave.com/embed/B3Z5uC40XZiHiEDI4N.js"></script>
</body>
</html>
