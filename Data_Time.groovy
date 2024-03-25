import groovy.time.TimeCategory


    class Data_Time {
        static Date currentDate

        static void main(String[] args) {
        currentDate = new Date()
        println currentDate

            final def date = use(TimeCategory) {
                //after30Sec = currentDate + 30.seconds
            }
            date
    }
 }