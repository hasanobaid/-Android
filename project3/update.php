<?php
$con= new mysqli('localhost', 'root', '', 'project3');

$type= $_POST['type'];
$company= $_POST['company'];
$price= $_POST['price'];
<<<<<<< HEAD
$ins="SELECT * FROM laptop WHERE type='$type'"; 
=======
$ins="SELECT * FROM `laptop` WHERE type='$type'"; 
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
$result=mysqli_query($con,$ins);

$num=mysqli_num_rows($result);
if($num==1){

<<<<<<< HEAD
$reg="update laptop set company= '$company', price = '$price' where type= '$type'";
=======
$reg="UPDATE `laptop` SET `type`='$type',`company`=''$company,`price`='price' WHERE type = '$type'";
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
	mysqli_query($con,$reg);
	echo "sucssessful";
}else{
	
echo "user not found";
}


?>