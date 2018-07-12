package tw.core;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tw.core.model.Record;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


/**
 * Created by jxzhong on 2017/9/23.
 */
public class AnswerTest {
    private Answer actualAnswer;

    @BeforeEach
    public void setUp() {
        actualAnswer = Answer.createAnswer("1 2 3 4");
    }

//    @Test
//    public void should_return_createAnswer(){
//        assertThat(this.actualAnswer,is(Answer.createAnswer("1 2 3 4")));
//    }

    @Test
    public void should_return_index_when_call_getIndexOfNum(){
        //given
        String num="4";
        assertThat(this.actualAnswer.getIndexOfNum(num),is(3));
    }

    @Test
    public void should_string_of_list_when_call_toString(){
        assertThat(actualAnswer.toString(),is("1 2 3 4"));
    }

    @Test
    public void should_throw_Exception_when_call_validate(){
        Answer answer=new Answer();
        //answer.
        //assertThat(actualAnswer.toString(),is("1 2 3 4"));
    }

    @Test
    public void should_record_correct_answer_of_list_when_call_check(){
        //given
        Record record=actualAnswer.check(Answer.createAnswer("1 3 5 4"));

        assertThat(record.getValue(),is("2A1B"));
    }

}