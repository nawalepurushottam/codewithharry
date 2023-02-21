<?php
    $str="This this this";
    echo $str."<br>";

    $lenn=strlen($str);
    echo "The length of this string is ".$lenn.". Thank you <br>";
    echo "The number of words in this string is ".str_word_count($str).". Thank you <br>";
    echo "The reverse string is ".strrev($str).". Thank you <br>";
    echo "The search of 'is' in this string is ".strpos($str,"is").". Thank you <br>";
    echo "The replaced string is ".str_replace("is","at",$str).". Thank you <br>";
    // here . is string concatenation operator
    // echo $lenn;

?>

