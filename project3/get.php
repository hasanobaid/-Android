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
print_r($myArray);
}else{
	echo "there is no row";
}


?>