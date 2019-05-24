<?php
$con= new mysqli('localhost', 'root', '', 'project3');

$type= $_POST['type'];
$company= $_POST['company'];
$price= $_POST['price'];
$ins="SELECT * FROM laptop WHERE type='$type'"; 
$result=mysqli_query($con,$ins);

$num=mysqli_num_rows($result);
if($num==1){

$reg="update laptop set company= '$company', price = '$price' where type= '$type'";
	mysqli_query($con,$reg);
	echo "sucssessful";
}else{
	
echo "user not found";
}


?>