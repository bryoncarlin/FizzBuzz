//
//  Fizzbuzz.swift
//  FizzBuzz
//
//  Created by Bryon Carlin on 7/28/22.
//

import Foundation

struct fizzbuzz(bee: Int) -> String {
    switch
    if(bee % 3 == 0, bee % 5 == 0){
    case(true,false):
        return: "Fizz"
    case(false,true):
        return: "Buzz"
    case(true,true):
        return: "FizzBuzz"
    case(false,false):
        return String(bee)
    }
}

print(fizzbuzz(bee: 15))
