output "Insert your credit card"
output "Press 1 if card was entered the right side and Press 2 if it was entered the wrong side"
input SIDE
loop while SIDE==2
    output "Insert the credit card again"
    output "Press 1 if card was entered the right side and Press 2 if it was entered the wrong side"
    input SIDE
end loop
output "Enter the pincode"
output "Press 1 if pin-code was right and Press 2 if pin-code was wrong"
input PINCODE
loop while PINCODE==2
    output "Enter the pin-code again"
    output "Press 1 if pin-code was right and Press 2 if pin-code was wrong"
    input PINCODE
end loop
output "Enter withdrawal sum"
input BALANCE
FLAG=true
loop while FLAG
    input SUM
    if SUM>BALANCE then
        output "Change your withdrawal sum"
    end if
    if SUM<BALANCE then
        FLAG=false
    end if
end loop
output "You have succesfully withdrawn " + SUM 
