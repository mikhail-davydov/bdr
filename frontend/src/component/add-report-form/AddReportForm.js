import {Field, Form, Formik} from "formik";
import {Component} from "react";

import "./AddReportForm.css";

export class AddReportForm extends Component {

    render() {
        let buttonText = "Добавить";

        return (
            <Formik
                initialValues={{
                    reportName: "",
                    reportComment: "",
                }}
                onSubmit={() => {
                    // todo: handle form submit, add report to list
                    console.log("Click on add report button");
                }}>
                <Form className="report-form">
                    <Field className="report-form__name"
                           name="reportName"
                           placeholder="Название Отчета"
                    />
                    <Field className="report-form__comment"
                           name="reportComment"
                           placeholder="Комментарий"
                    />
                    <button className="button report-form__submit"
                            type="submit">
                        {buttonText}
                    </button>
                </Form>
            </Formik>
        );
    }

}