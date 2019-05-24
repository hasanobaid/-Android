<?php
$con= new mysqli('localhost', 'root', '', 'project3');

$type= $_POST['type'];
$company= $_POST['company'];
$price= $_POST['price'];
$ins="SELECT * FROM `labtop` WHERE type='$type'"; 
$result=mysqli_query($con,$ins);


$num=mysqli_num_rows($result);
if($num==1){
	echo "laptop is exist!";

}else{
	$reg="INSERT INTO `laptop`( `type`, `company`, `price`) VALUES ('$type','$company','$price')";
	mysqli_query($con,$reg);
	echo "sucssessful";

}


?>