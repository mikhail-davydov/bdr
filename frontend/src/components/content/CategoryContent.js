import React from "react";
import Button from "../button/Button";

class CategoryContent extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            categories: [],
            buttonClass: "button",
            clickMe: "Нажми меня",
            clicked: "Нажал"
        }
    }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        const headers = {"Accept": "application/json"}
        fetch(
            "http://localhost:8080/api/category/list",
            {
                mode: "no-cors",
                headers
            }
        )
            .then(response => response.json())
            .then(data => this.setState({
                categories: data
            }))
            .catch(error => console.error(error));

        console.log("categories: ", this.state.categories);

        let options = this.state.categories.map((category) =>
            <option value={category.categoryId}>{category.categoryDescription}</option>
        );

        return (
            <form className="category-form">
                <ul className="category-form__items">
                    <li className="category-form__item">
                        <label>
                            Категория:
                            <input type="text" name="name"/>
                        </label>
                    </li>
                    <li className="category-form__item">
                        <label>
                            Родительская Категория:
                            <select name="parentName" defaultValue="">
                                {options}
                            </select>
                        </label>
                    </li>
                    <li className="category-form__item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, this.state.clicked)}
                                buttonValue={this.state.clickMe}
                        />
                    </li>
                </ul>
            </form>
        )
    }

}

export default CategoryContent;