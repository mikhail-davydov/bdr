import {Field, Form, Formik} from "formik";
import {Component} from "react";

import "./CategoryForm.css";

export class CategoryForm extends Component {

    render() {
        let buttonText = "Добавить";

        return (
            <Formik
                initialValues={{
                    categoryName: "",
                    categoryComment: "",
                }}
                onSubmit={() => {
                    // todo: handle form submit, add category to list
                    console.log("Click on submit category form button");
                }}>
                <Form className="category-form">
                    <Field className="category-form__name"
                           name="categoryName"
                           placeholder="Название Категории"
                    />
                    <Field className="category-form__comment"
                           name="categoryComment"
                           placeholder="Комментарий"
                    />
                    <button className="button category-form__submit"
                            type="submit">
                        {buttonText}
                    </button>
                </Form>
            </Formik>
        );
    }

}