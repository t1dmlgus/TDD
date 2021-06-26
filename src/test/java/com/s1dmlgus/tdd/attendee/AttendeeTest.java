package com.s1dmlgus.tdd.attendee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class AttendeeTest {
    
    
    
    @Test
    public void testAttendee_이름추가() throws Exception{
        //given
        Attendee attendee = new Attendee();
        //when
        attendee.add("이의현");

        //then
        Assertions.assertThat(attendee.get(1)).isEqualTo("이의현");


    }

}