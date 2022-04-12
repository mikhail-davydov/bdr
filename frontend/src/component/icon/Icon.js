import {Component} from "react";

import "./Icon.css";

class Icon extends Component {

    render() {
        let className = this.props.class + " icon";
        return (
            <div className={className}>
                {this.props.content}
            </div>
        )
    }

}

export default Icon;