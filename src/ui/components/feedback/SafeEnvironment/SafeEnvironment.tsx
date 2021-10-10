import React from "react";
import { SafeEnvironmentContainer } from './SafeEnvironment.style';
import { Container } from "@mui/material";

const SafeEnvironment = () => {
    return ( 
        <SafeEnvironmentContainer>
            <Container>
                Ambiente 100% Seguro <i className={ "twf-lock" } />
            </Container>
        </SafeEnvironmentContainer>
    );
}

export default SafeEnvironment;