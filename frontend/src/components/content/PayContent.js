import React from "react";
import Button from "../button/Button";

class PayContent extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            buttonClass: "button",
            clickMe: "Нажми меня",
            clicked: "Нажал"
        }
    }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        return (
            <form className="pay-form">
                <ul className="pay-form__items">
                    <li className="category-form__item">
                        <label>
                            Name:
                            <input type="text" name="name"/>
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
        );
    }

}

export default PayContent;