package com.tekdays

class Sponsor {
	String name
	String website
	String description
	byte[] logo
	String toString(){
		name
	}

	static hasMany=[events: TekEvent]
	static belongsTo=TekEvent

    static constraints = {
    	name blank: false
    	website blank: false, url:true
    	description blank:false,maxSize:5000
    	logo nullable:true, maxSize:1000000
    }
}
