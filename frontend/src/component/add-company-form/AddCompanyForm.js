import {Field, Form, Formik} from "formik";
import {Component} from "react";

import "./AddCompanyForm.css";

export class AddCompanyForm extends Component {

    render() {
        let buttonText = "Добавить";

        return (
            <Formik
                initialValues={{
                    companyName: "",
                    companyComment: "",
                }}
                onSubmit={() => {
                    // todo: handle form submit, add company to list
                    console.log("Click on add company button");
                }}>
                <Form className="company-form">
                    <Field className="company-form__name"
                           name="companyName"
                           placeholder="Название Компании"
                    />
                    <Field className="company-form__comment"
                           name="companyComment"
                           placeholder="Комментарий"
                    />
                    <button className="button company-form__submit"
                            type="submit">
                        {buttonText}
                    </button>
                </Form>
            </Formik>
        );
    }

}