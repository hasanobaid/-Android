<?php
$con= new mysqli('localhost', 'root', '', 'project3');


$ins="SELECT * FROM `laptop`"; 
$result=mysqli_query($con,$ins);
$myArray = array();
$num=mysqli_num_rows($result);
if($num>0){
    while($row = $result->fetch_assoc()) {
    	         $myArray[] = $row;

    }
<<<<<<< HEAD
$json = json_encode(array($myArray));
echo substr($json,1,-1);
=======
print_r($myArray);
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
}else{
	echo "there is no row";
}


?>