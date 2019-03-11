<?php
$n = rtrim(fgets(STDIN));
$kMap = [];
for ($row=0; $row < ($n%2) == 0 ? $n : $n-1; $row++){
    $kMapRow = [];
    for ($item=0; $item < ($n%2) == 0 ? $n : (($n*2)-2); $item++){
        $itemInput = rtrim(fgets(STDIN)); 
        
        /*if ($itemInput > 1 || $itemInput < 0){
            echo "Invalid Input!";
            break;
        }*/
        
        $kMapRow[] += $itemInput;
    }
    $kMap += $kMapRow;
}

/*
For Even Number of inputs 
  A
B 0 0
  0 0

For Odd Number of inputs
  AB
C 0 0 0 0
  0 0 0 0 

$n = 5;
       ABC  (n*2-2)
    CD 0 0 0 0 0 0 0 0
       0 0 0 0 0 0 0 0
 (n-1) 0 0 0 0 0 0 0 0
       0 0 0 0 0 0 0 0
*/
function circuitMap($kMap){}
?>
